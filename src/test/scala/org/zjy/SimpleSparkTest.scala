package org.zjy

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.junit.Test

@Test
class SimpleSparkTest extends SimpleSpark {

  @Test
  def sparkReadTest = {
    val dataFrame: DataFrame = spark.read.text("file:///Users/zjy/project/shell/read_file.sh")
    dataFrame.show(false)
  }

}
