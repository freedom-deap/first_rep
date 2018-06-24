'''
Created on 2018/06/16

@author: freed
'''

#特定の単語と類似した単語を出力
from gensim import models

model = models.Doc2Vec.load("doc2vec.model")
for result in model.most_similar(positive="ゴミ", topn=10):
            print(result[0] + ":" + str(result[1]))