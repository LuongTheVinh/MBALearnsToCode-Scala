import pkg.conslist.List
import pkg.intset.{Empty, NonEmpty}


def f(xs: List[NonEmpty]) = xs prepend Empty
