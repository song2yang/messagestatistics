import org.apache.spark.{SparkConf, SparkContext}

object Application extends App{
  print(111)
  val conf = new SparkConf();
  conf.set("spark.master", "local")
  conf.set("spark.app.name", "spark demo")
  val sc = new SparkContext(conf);

  val msgFile = sc.textFile("hdfs://10.0.1.95:9000/data/gy/test.csv");
  print(msgFile.name)
}