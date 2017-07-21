from pyspark.sql import *
from pyspark import SparkConf, SparkContext

con = SparkConf()
sc = SparkContext(conf = con)

RDD = sc.textFile("/home/cloudera/data.txt")
header = RDD.first()
RDD = RDD.map(lambda x: x.split(","))
df = sqlContext.createDataFrame(RDD)

df.show()
df.printSchema()

df.select("_2").show()
df.select(["_1", "_2"]).show()
