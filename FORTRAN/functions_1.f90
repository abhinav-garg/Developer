! Understanding functions

PROGRAM Test
IMPLICIT NONE
REAL :: a, b, c, root
READ(*,*) a, b, c
root = LargerRoot(a, b, c)
WRITE(*,*) a, b, c, root

CONTAINS
  INTEGER FUNCTION LargerRoot (a, b, c)
    IMPLICIT NONE  
    REAL, INTENT(IN) :: a, b, c   ! See the next program "function_2" to understand what it means
    REAL :: d, r1, r2
    d = SQRT(b * b - 4.0 * a * c)
    r1 = (-b + d) / (2.0 * a)
    r2 = (-b - d) / (2.0 * a)
    IF (r1 >= r2) THEN
       LargerRoot = r1   ! The function name stores its return value
    ELSE
       LargerRoot = r2
    END IF
  END FUNCTION LargerRoot

END PROGRAM Test
