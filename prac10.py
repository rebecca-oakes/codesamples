from pyspark import SparkConf, SparkContext

con = SparkConf()
sc = SparkContext(conf = con)

list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
rdd = sc.parallelize(list, 3)
rdd.saveAsTextFile("/home/cloudera/pracTen")
