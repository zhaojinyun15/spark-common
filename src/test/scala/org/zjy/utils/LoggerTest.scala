package org.zjy.utils

import org.junit.Test
import org.slf4j.Logger

@Test
class LoggerTest {

  @Test
  def getLoggerTest() = {
    val logger: Logger = Logger.getLogger(this.getClass)
    logger.info("first log test")
  }

}
