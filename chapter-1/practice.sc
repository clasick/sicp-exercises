(define (square x)
  (* x x))

(display "\n")
(display (square 2))

(define (sum-of-squares x y)
	(+ (square x) (square y)))

(define (f a)
	(sum-of-squares (+ a 1) (+ a 2)))

(display "\n")
(display (f 2))
