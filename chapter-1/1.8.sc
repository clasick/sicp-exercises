#lang racket

(define (cube x)
	(* x x x))

(define (square x)
	(* x x))

(define (average x y)
	(/ (+ x y) 3))

(define (cube-root x)	
	(cube-root-iter 1.0 x))

(define (good-enough? guess x)
	(< (abs (- x (cube guess))) 0.0001))

(define (next-guess y x)
	(average (/ x (square y)) (* 2 y)))
	
(define (cube-root-iter guess x)
        (display guess)
        (display "\n")
        (if (good-enough? guess x)
	    guess
	    (cube-root-iter (next-guess guess x) x)))

(display (cube-root 27))
