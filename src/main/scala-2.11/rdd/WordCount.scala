package rdd

import org.apache.spark.SparkContext

object WordCount {

  def main(args: Array[String]) {
    require(args.length > 0, "Input path is required")
    require(args.length > 1, "Output path is required")

    val sc = new SparkContext

    sc.textFile(args(0))
      .flatMap(_.split(","))
      .map(word => (word, 1))
      .reduceByKey(_ + _)
      .saveAsTextFile(args(1))

    sc.stop()
  }
}
