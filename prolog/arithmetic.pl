reigns(ram,1900,1950).
reigns(mike,1951,1970).
reigns(dilshan,1971,1985).
reigns(ravi,1986,2010).

ruler(X,Y):- reigns(X,A,B),Y>=A,Y=<B.


population(china,100).
population(india,85).
population(usa,30).
population(germany,9).

area(china,10).
area(india,4).
area(usa,12).
area(germany,2).

density(X,Y):-population(X,Pop), area(X,Ar), Y is Pop/Ar.