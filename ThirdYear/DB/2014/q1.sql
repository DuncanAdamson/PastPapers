/*
a)
*/
CREATE TABLE Attendance(
    dogid INT NOT NULL,
    showname VARCHAR(128) NOT NULL,
    opendate DATE NOT NULL,
    place INT,
    FOREIGN KEY (dogid) REFERENCES Dog(dogid),
    FOREIGN KEY (showname) REFERENCES Show(showname),
    PRIMARY KEY (dogid, showname, opendate)
)
/*
b)
*/
SELECT DISTINCT Dog.name
FROM Dog d
WHERE EXISTS(
    SELECT *
    FROM Attendance a1
    WHERE a1.place = 1 AND a2.dogid = d.dogid AND EXISTS(
        SELECT *
        FROM Attendance a2
        WHERE a1.dogid = a2.dogid AND (a1.showname != a2.showname OR a1.opendate != a2.opendate)
    )
)
/*
c) SEE q1c.java
*/
/*
d)
The optimisation process is the process of attempting make the query run with as few computations as possible. This mostly involves removing, or delaying, costly operations such as joins where possible.
The process of optimisation for a query is to construct all possible execution plans of the query, then estimate the cost of each of them. This will normally be done through the creation of an expression tree, a tree representing the relational algebra. The Equivalence rules allow different trees to be produced for the same query, giving us several trees to choose from. From these, we estimate the cost of each operation by considering what operation it is, and the size of the metadata associated with it.
For example, if trying to find the names of all dogs who’s owners are over the age of 30, we could have either of these trees:
    π Dog.name        π Dog.name
      |                     |
      |                     |
      ⋈                 σ age > 30
     / \                    |
    /   \                   |
 Dog    σ age > 30          ⋈
          |                /  \
          |               /    \
       Owner            Dog     Owner
From these two, we the first one would be faster to execute as it preforms the join on the filtered list, thus reducing the amount of operations to perform.
*/
