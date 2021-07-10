package org.zjy.utils

import org.slf4j
import org.slf4j.LoggerFactory

object Logger {
  def getLogger(clazz: Class[_]): slf4j.Logger = {
    LoggerFactory.getLogger(clazz)
  }
}
