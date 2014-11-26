PROGRAM Functions_2
  IMPLICIT NONE   ! IMPLICIT NONE has to do with implicit assumptions with regards to variable types 
  REAL :: a, b, c, d, e, f
  INTEGER :: p
  READ(*,*) a, b, c, d, e, f
  p = Test(a, b, c, d, e, f)
  WRITE(*,*) a, b, c, d, e, f

CONTAINS
  ! INTENT is defined with respect to function's arguments
  ! INTENT(IN) implies that the corresponding formal arguments take values from outside, but cannot change the values in the variables passed to them
  ! INTENT(OUT) implies that the corresponding formal arguents hold values intended to be passed out to variables they represent, and do not take in anything
  ! INTENT(INOUT) does both the above

  INTEGER FUNCTION Test(a, b, c, d, e, f)
    IMPLICIT NONE
    REAL, INTENT(IN) :: a, b
    REAL, INTENT(OUT) :: c, d
    REAL, INTENT(INOUT) :: e, f
    c = a
    d = b
    e = e / 2
    f = f / 2
    Test = 1
  END FUNCTION Test

END PROGRAM Functions_2
