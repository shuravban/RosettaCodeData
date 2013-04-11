val q0=Quaternion(1.0, 2.0, 3.0, 4.0);
val q1=Quaternion(2.0, 3.0, 4.0, 5.0);
val q2=Quaternion(3.0, 4.0, 5.0, 6.0);
val r=7;
	
println("q0 = "+ q0)
println("q1 = "+ q1)
println("q2 = "+ q2)
println("r  = "+ r)
println()
	
println("q0.re            = "+ q0.re)
println("q0.im            = "+ q0.im)
println("q0.norm          = "+ q0.norm)
println("q0.negative      = "+ q0.negative)
println("-q0              = "+ -q0)
println("q0.conjugate     = "+ q0.conjugate)
println("~q0              = "+ ~q0)
println("q1+q2            = "+ (q1+q2))
println("q2+q1            = "+ (q2+q1))
println("q1+r             = "+ (q1+r))
println("r+q1             = "+ (r+q1))
println("q1-q2            = "+ (q1-q2))
println("q2-q1            = "+ (q2-q1))
println("q1-r             = "+ (q1-r))
println("r-q1             = "+ (r-q1))
println("q1*q2            = "+ q1*q2)
println("q2*q1            = "+ q2*q1)
println("q1*r             = "+ q1*r)
println("r*q1             = "+ r*q1)
println("(q1*q2)!=(q2*q1) = "+ ((q1*q2)!=(q2*q1)))
println("q1/q2            = "+ q1/q2)
println("q2/q1            = "+ q2/q1)
println("q1/r             = "+ q1/r)
println("r/q1             = "+ r/q1)