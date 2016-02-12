import pkg.{Rational => Rat}


// create a few Rationals
val r = new Rat(1, 2)
val nr = new Rat(1, -2)
val R = new Rat(2, 4)
val s = new Rat(3, 4)
val z = new Rat(0, 1)
val Z = new Rat(0, -3)


// unary operations on r
println(s"+ $r   = ${+r}")
println(s"- $r   = ${-r}")
println(s"Inverse $r   = ${r.inv}")


// binary operation on r and R
println(s"$r equal to $R   = ${r eq R}")
println(s"$r == $R   = ${r == R}\n")

println(s"$r greater than $R   = ${r gt R}")
println(s"$r > $R   = ${r > R}\n")

println(s"$r greater than or equal to $R   = ${r ge R}")
println(s"$r >= $R   = ${r >= R}\n")

println(s"$r less than $R   = ${r lt R}")
println(s"$r < $R   = ${r < R}\n")

println(s"$r less than or equal to $R   = ${r le R}")
println(s"$r <= $R   = ${r <= R}\n")

println(s"$r plus $R   = ${r add R}")
println(s"$r + $R   = ${r + R}\n")

println(s"$r minus $R   = ${r sub R}")
println(s"$r - $R   = ${r - R}\n")

println(s"$r times $R   = ${r mul R}")
println(s"$r * $R   = ${r * R}\n")

println(s"$r divided by $R   = ${r div R}")
println(s"$r / $R   = ${r / R}")


// binary operations on r and s
println(s"$r equal to $s   = ${r eq s}")
println(s"$r == $s   = ${r == s}\n")

println(s"$r greater than $s   = ${r gt s}")
println(s"$r > $s   = ${r > s}\n")

println(s"$r greater than or equal to $s   = ${r ge s}")
println(s"$r >= $s   = ${r >= s}\n")

println(s"$r less than $s   = ${r lt s}")
println(s"$r < $s   = ${r < s}\n")

println(s"$r less than or equal to $s   = ${r le s}")
println(s"$r <= $s   = ${r <= s}\n")

println(s"$r plus $s   = ${r add s}")
println(s"$r + $s   = ${r + s}\n")

println(s"$r minus $s   = ${r sub s}")
println(s"$r - $s   = ${r - s}\n")

println(s"$r times $s   = ${r mul s}")
println(s"$r * $s   = ${r * s}\n")

println(s"$r divided by $s   = ${r div s}")
println(s"$r / $s   = ${r / s}")


// binary operations on nr and z
println(s"$nr equal to $z   = ${nr eq z}")
println(s"$nr == $z   = ${nr == z}\n")

println(s"$nr greater than $z   = ${nr gt z}")
println(s"$nr > $z   = ${nr > z}\n")

println(s"$nr greater than or equal to $z   = ${nr ge z}")
println(s"$nr >= $z   = ${nr >= z}\n")

println(s"$nr less than $z   = ${nr lt z}")
println(s"$nr < $z   = ${nr < z}\n")

println(s"$nr less than or equal to $z   = ${nr le z}")
println(s"$nr <= $z   = ${nr <= z}\n")

println(s"$nr plus $z   = ${nr add z}")
println(s"$nr + $z   = ${nr + z}\n")

println(s"$nr minus $z   = ${nr sub z}")
println(s"$nr - $z   = ${nr - z}\n")

println(s"$nr times $z   = ${nr mul z}")
println(s"$nr * $z   = ${nr * z}\n")


// binary operations on z and Z
println(s"$z equal to $Z   = ${z eq Z}")
println(s"$z == $Z   = ${z == Z}\n")

println(s"$z greater than $Z   = ${z gt Z}")
println(s"$z > $Z   = ${z > Z}\n")

println(s"$z greater than or equal to $Z   = ${z ge Z}")
println(s"$z >= $Z   = ${z >= Z}\n")

println(s"$z less than $Z   = ${z lt Z}")
println(s"$z < $Z   = ${z < Z}\n")

println(s"$z less than or equal to $Z   = ${z le Z}")
println(s"$z <= $Z   = ${z <= Z}\n")

println(s"$z plus $Z   = ${z add Z}")
println(s"$z + $Z   = ${z + Z}\n")

println(s"$z minus $Z   = ${z sub Z}")
println(s"$z - $Z   = ${z - Z}\n")

println(s"$z times $Z   = ${z mul Z}")
println(s"$z * $Z   = ${z * Z}\n")
