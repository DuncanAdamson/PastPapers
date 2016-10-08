/*
a)
A scalar subquery is a subquery which returns a single value on which it is possible to preform arithmetic comparisons, for example, a subquery which returns the maximum value of a column from a table.
As these effectively return a column of one row and one column, a runtime error could occur if the subquery was to be run over a table which caused it to return a null value, for instance in the above example, if there was to be no values in that table it would return NULL, which could cause a runtime error. To prevent this, one could ensure the query using this is checking for null values.
*/
/*
b)
SQL's scoping rules are that an attribute refers to the most closely nested relation with that attribute.
For example:
SELECT *
FROM Dog
WHERE EXISTS(
    SELECT *
    FROM Dog
    WHERE dogid > 1
)
The nested dogid takes the value from the Dog relation in the subquery, rather than the one in the outer query
*/
/*
c)
*/
DELETE FROM Beers b1
WHERE EXISTS(
    SELECT *
    FROM Beers b2
    WHERE b1.manufacturer = b2.manufactuerer AND b1.name <> b2.name
)
/*
The semantics of deletion in SQL is that, rather than deleting a tuple when one matching the query is found, it first marks all valid tuples for deletion, then deletes them. This means that for example, given two beers from the same manufacturer, the first one would be found and marked for deletion, then once it reached the second, as the first one still exists within the database, it would also be marked to be deleted.
*/
/*
d)  I can't find any references to the Trigger keyword in the lecture notes, if anyone can confirm/deny this?
*/
/*
e)
These would give the same result as the Natural Join is contained entirely within the Full Outer Join, which is also equivalent to the union of the left outer join with the right outer join.
*/
