# Assignment 8: The Players

**Sum of Columns in a Matrix**
**COP2250 Java Programming | Pyatt Labs**

---

## Cast of Characters

| Player | Role | Example |
|--------|------|---------|
| `double[][]` | A 2D array (matrix) of decimal values | `double[][] m = new double[3][4]` |
| `m.length` | Number of rows in the matrix | `3` |
| `m[0].length` | Number of columns in the matrix | `4` |
| `m[i][j]` | Element at row `i`, column `j` | `m[1][2]` = row 1, column 2 |
| `columnIndex` | Which column to sum (passed as parameter) | `0`, `1`, `2`, or `3` |
| `Scanner` | Reads matrix values from the user | `input.nextDouble()` |

---

## The Key Idea: Traversing a Column

To sum a **row**, you fix the row and loop over columns:
```java
for (int j = 0; j < m[0].length; j++) {
    sum += m[rowIndex][j];
}
```

To sum a **column**, you fix the column and loop over rows:
```java
for (int i = 0; i < m.length; i++) {
    sum += m[i][columnIndex];
}
```

**The column index stays constant. The row index changes.**

---

## The Method Header (Required)
```java
public static double sumColumn(double[][] m, int columnIndex)
```

---

## The Flow
```
1. Create a 3x4 matrix
2. Read 12 values from user (row by row)
3. For each column (0 through 3):
       call sumColumn(m, columnIndex)
       display the result
```

---

## Sample Output
```
Enter a 3-by-4 matrix row by row:
1 2 3 4
5 6 7 8
9 10 11 12
Sum of column 0 is 15.0
Sum of column 1 is 18.0
Sum of column 2 is 21.0
Sum of column 3 is 24.0
```

---

## Common Mistakes

| Mistake | Fix |
|---------|-----|
| Looping over columns instead of rows in sumColumn | Fix the column index; loop `i` over `m.length` (rows) |
| Using `m.length` for columns | Columns = `m[0].length`, rows = `m.length` |
| Forgetting to reset sum between columns | Declare `sum` inside the method, not outside |
| Off-by-one in nested loop | Use `< m.length` and `< m[0].length`, never `<=` |

---

## Starter Code

**[Download SumColumn.java](https://raw.githubusercontent.com/PyattLabs/scf-java-labs/main/assignments/assignment8-sumcolumn/SumColumn.java)**

Right-click → Save Link As

---

*This assignment is instructor-authored intellectual property.*
