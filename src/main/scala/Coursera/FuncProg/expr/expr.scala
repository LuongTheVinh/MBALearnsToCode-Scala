package Coursera.FuncProg.expr


trait Expr {
  def eval: Int =
    this match {
      case Num(n) => n
      case Sum(e1, e2) => e1.eval + e2.eval
      case Prod(e1, e2) => e1.eval * e2.eval
    }

  def isSum: Boolean =
    this match {
      case Num(n) => false
      case Sum(e1, e2) => true
      case Prod(e1, e2) => false
    }

  override def toString =
    this match {
      case Num(n) => n.toString
      case Sum(e1, e2) => e1 + " + " + e2
      case Prod(e1, e2) => {
        (if (e1.isSum) "(" + e1 + ")" else e1) + " * " +
          (if (e2.isSum) "(" + e2 + ")" else e2)
      }
    }
}


case class Num(n: Int) extends Expr


case class Sum(e1: Expr, e2: Expr) extends Expr


case class Prod(e1: Expr, e2: Expr) extends Expr
