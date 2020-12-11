(define (square x)
  (* x x))

(define (sum-of-squares x y)
	(+ (square x) (square y)))

(define (f a)
	(sum-of-squares (+ a 1) (+ a 2)))

(define (>= x y)
	(or (> x y) (= x y)))

(define (square-2-largest x y z)
	(cond ((and (>= x y) (> y z)) (sum-of-squares x y))
	      ((and (>= x z) (> z y)) (sum-of-squares x z))
	      (else (sum-of-squares y z))))

(display (square-2-largest 1 2 3))
;;
;; o/p: 2^2 + 3^2
;;      4 + 9
;;      13
