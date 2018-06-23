#coding: UTF-8
'''
Created on 2018/06/22

@author: lab
'''

import MeCab
from time import sleep

f = open('review_irony.txt',encoding='utf-8')

m = MeCab.Tagger()
i=0
line = f.readline()
while line:
    print(m.parse(line))
    #sleep(2)
    print(i)
    i=i+1
    line = f.readline()
print("finish!!")