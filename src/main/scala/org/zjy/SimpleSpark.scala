package org.zjy

import org.apache.spark.sql.SparkSession

class SimpleSpark {
  implicit val spark: SparkSession = getSpark

  def getSpark: SparkSession = {
    SparkSession.builder().master("local[4]").getOrCreate()
  }

  def getSparkRemote: SparkSession = {
    SparkSession.builder()
      .appName("spark to remote hive")
      .master("local[4]")
      .config("hive.metastore.uris", "thrift://47.117.136.159:9083")
      .enableHiveSupport()
      .getOrCreate()
  }
}
