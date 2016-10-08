/*
1a) project(b) & project(d) (π)
               ^
              / \
               |
               |
             join on c (⋈)
            /    \
           /      \
          /        \
σ R.a = 'c'    σ S.e = 2

    π b and d
       ^
      / \
       |
       |
    σ R.a = 'c'
       ^
      / \
       |
       |
    σ S.e = 2
       ^
      / \
       |
       |
    ⋈ on c

The first one is much more efficient as it preforms the costly join on the filtered list, rather than joining then filtering as in the second one
*/
/*
b)
Firstly, Unique values allow for instances to be NULL, where as Primary Keys may not be.
Secondly, There may only be one primary key, but there may as many unique values as the designer wants.
*/
/*
c)
*/
SELECT Beers.name, AVERAGE(price)
FROM Beers, Sells
WHERE Beer.name = Sells.beer
GROUP BY Beer.name
HAVING Count(bar) > 2 OR Beer.manufacturer = "Hoegaarden"
/*
d) They may not both produce the same result as, in the case where there are tupples with the same values for all of a,b and c, there would only be one returned for SELECT DISTINCT, where as for the intersect it would return all tupples of R.
*/
/*
e)i) 1) A new tupple with name 'Fred' and salary 12000 is created in the table Foo.
     2) All tuples where the name is 'Sue' have the salary value set to 20000
     3) As there is already a tupple with the name 'Sally', an error is thrown when trying to insert a new one.
     4) The tupple with the name 'Joe' is deleted
     This gives the end result of:
      name  |  salary
     -------|--------
     'Sally'| 10000
     'Sue'  | 20000
     'Fred' | 12000
ii)  42000
*/
