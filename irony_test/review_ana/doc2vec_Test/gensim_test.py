#coding: UTF-8
'''
Created on 2018/06/22

@author: lab
'''

import MeCab
from gensim.models.doc2vec import Doc2Vec
from gensim.models.doc2vec import TaggedDocument
from gensim.models.doc2vec import LabeledSentence
from gensim import models
import collections
import os
import sys
from time import sleep

# 文章から単語に分解して返す
def split_into_words(doc,name=''):
    mecab = MeCab.Tagger("-Ochasen")
    lines = mecab.parse(doc).splitlines()
    words = []
    for line in lines:
        chunks = line.split('\t')
        if len(chunks) > 3 and (chunks[3].startswith('動詞') or chunks[3].startswith('形容詞') or (chunks[3].startswith('名詞') and not chunks[3].startswith('名詞-数'))):
            words.append(chunks[2])
            print(chunks[2])
    return LabeledSentence(words=words, tags=[name])

# 学習
def train(sentences):
    model = models.Doc2Vec(size=400, alpha=0.0015, sample=1e-4, min_count=1, workers=4)
    model.build_vocab(sentences)
    for x in range(30):
        print(x)
        model.train(sentences, total_examples=model.corpus_count, epochs=model.iter)
        ranks = []
        for doc_id in range(8):
            inferred_vector = model.infer_vector(sentences[doc_id].words)
            sims = model.docvecs.most_similar([inferred_vector], topn=len(model.docvecs))
            rank = [docid for docid, sim in sims].index(sentences[doc_id].tags[0])
            ranks.append(rank)
        print(collections.Counter(ranks))
        if collections.Counter(ranks)[0] >= PASSING_PRECISION:
            break
    return model


f = open('review_irony.txt',encoding='utf-8')

m = MeCab.Tagger('-Ochasen')
OUTPUT_MODEL = 'doc2vec.model'
PASSING_PRECISION = 93
lines = [line for line in f.readlines()]
sentences = [split_into_words(line,) for line in lines]
model = train(sentences)
model.save(OUTPUT_MODEL)
