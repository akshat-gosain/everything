colour(red).
colour(blue).
colour(green).
colour(yellow).

colouring(A,B,C,D,E,F):-colour(A),colour(B),colour(C),colour(D),colour(E),colour(F),
A\=B,A\=C,A\=D,A\=E,B\=C,B\=D,B\=E,C\=D,D\=E,D\=F,E\=F.



  
