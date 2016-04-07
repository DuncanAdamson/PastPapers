/*
a)
*/
CREATE TABLE MemberOf(
    bid INT NOT NULL,
    mid INT NOT NULL,
    startyear INT,
    endyear INT,
    instrument VARCHAR(64) NOT NULL,
    FOREIGN KEY (bid) REFERENCES Band(bid),
    FOREIGN KEY (mid) REFERENCES Member(mid),
    PRIMARY KEY (bid,mid)
)
/*
b
*/
