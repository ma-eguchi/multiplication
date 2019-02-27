object Multiplication {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 9) {
      for(j <- 1 to 9) {
        printf(s"%3d", i*j)
      }
      println()
    }
  }
}
