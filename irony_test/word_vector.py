'''
Created on 2018/06/22

@author: lab
'''

# -*- coding: utf-8 -*-
import gensim


class WordEmbeddings(object):

    def __init__(self):
        self._model = None

    def train_word_embeddings(self, sentences, save_path, **params):  # params‚ª‹ó‚¾‚ÆƒGƒ‰[‚ª‹N‚«‚é‚Á‚Û‚¢
        model = gensim.models.Word2Vec(sentences, **params)
        model.save(save_path)
        self._model = model

    def load_word_embeddings(self, path):
        model = gensim.models.word2vec.Word2Vec.load(path)
        self._model = model

    def get_word_vector(self, term):
        try:
            vector = self._model.wv[term]
        except KeyError:
            raise KeyError("Term doesn't exists.")
        return vector