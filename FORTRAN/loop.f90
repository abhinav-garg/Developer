PROGRAM loop
  ! Counting DO loop
  INTEGER :: counter, initial, final, step
  
  !READ(*,*) initial, final, step
  
  ! Counting up
  initial = 1
  final = 20
  step = 3
  DO counter = initial, final, step
     PRINT *, counter
  END DO

  WRITE(*,*)  !print a blank line
  ! Counting down
  initial = 20
  final = 1
  step = -3
  DO counter = initial, final, step
     PRINT *, counter
  END DO
  
  
END PROGRAM loop
