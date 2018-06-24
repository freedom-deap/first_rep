'''
Created on 2018/06/16

@author: freed
'''
from gensim import models

model = models.Doc2Vec.load("doc2vec.model")
for result in model.most_similar(positive="面白い", topn=10):
            print(result[0] + ":" + str(result[1]))