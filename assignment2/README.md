# Assignment 2
Spring 2020 - COMP 4040 - Keaton Burleson

## Running
Simply execute the `exec:java` Maven build.

```shell script
$ mvn exec:java
```

## Example Output
*See `screenshots/` directory for all examples from the assignment*

```
Enter a time expression (hh:mm(:ss)?, hh(mm(ss)?)? or h(mm)?, single RETURN to exit)!
11
11 = 11 h, 0 min, 0 s

[Time, {11 h, 0 min, 0 s}] '11'
  [Time_HHMMSS, {11 h, 0 min, 0 s}] '11'
    [TwoDigits, {11}] '11'
      [Sequence] '11'
        [Digit] '1'
        [Digit] '1'
    [FirstOf, {0}]
    [EOI, {0}]


Enter a time expression (hh:mm(:ss)?, hh(mm(ss)?)? or h(mm)?, single RETURN to exit)!
11:23
11:23 = 11 h, 23 min, 0 s

[Time, {11 h, 23 min, 0 s}] '11:23'
  [Time_HH_MM_SS, {11 h, 23 min, 0 s}] '11:23'
    [OneOrTwoDigits, {11}] '11'
      [TwoDigits, {11}] '11'
        [Sequence] '11'
          [Digit] '1'
          [Digit] '1'
    [':', {11}] ':'
    [TwoDigits, {23}] '23'
      [Sequence, {11}] '23'
        [Digit, {11}] '2'
        [Digit, {11}] '3'
    [FirstOf, {0}]
    [EOI, {0}]


Enter a time expression (hh:mm(:ss)?, hh(mm(ss)?)? or h(mm)?, single RETURN to exit)!
11:23:45
11:23:45 = 11 h, 23 min, 45 s

[Time, {11 h, 23 min, 45 s}] '11:23:45'
  [Time_HH_MM_SS, {11 h, 23 min, 45 s}] '11:23:45'
    [OneOrTwoDigits, {11}] '11'
      [TwoDigits, {11}] '11'
        [Sequence] '11'
          [Digit] '1'
          [Digit] '1'
    [':', {11}] ':'
    [TwoDigits, {23}] '23'
      [Sequence, {11}] '23'
        [Digit, {11}] '2'
        [Digit, {11}] '3'
    [FirstOf, {45}] ':45'
      [Sequence, {45}] ':45'
        [':', {23}] ':'
        [TwoDigits, {45}] '45'
          [Sequence, {23}] '45'
            [Digit, {23}] '4'
            [Digit, {23}] '5'
    [EOI, {45}]


Enter a time expression (hh:mm(:ss)?, hh(mm(ss)?)? or h(mm)?, single RETURN to exit)!
5:59:00
5:59:00 = 5 h, 59 min, 0 s

[Time, {5 h, 59 min, 0 s}] '5:59:00'
  [Time_HH_MM_SS, {5 h, 59 min, 0 s}] '5:59:00'
    [OneOrTwoDigits, {5}] '5'
      [OneDigit, {5}] '5'
        [Digit] '5'
    [':', {5}] ':'
    [TwoDigits, {59}] '59'
      [Sequence, {5}] '59'
        [Digit, {5}] '5'
        [Digit, {5}] '9'
    [FirstOf, {0}] ':00'
      [Sequence, {0}] ':00'
        [':', {59}] ':'
        [TwoDigits, {0}] '00'
          [Sequence, {59}] '00'
            [Digit, {59}] '0'
            [Digit, {59}] '0'
    [EOI, {0}]


Enter a time expression (hh:mm(:ss)?, hh(mm(ss)?)? or h(mm)?, single RETURN to exit)!
2:45 PM
2:45 PM = 2 h, 45 min, 0 s

[Time, {2 h, 45 min, 0 s}]E '2:45'
  [Time_HH_MM_SS]E '2:45'
    [OneOrTwoDigits, {2}] '2'
      [OneDigit, {2}] '2'
        [Digit] '2'
    [':', {2}] ':'
    [TwoDigits, {45}] '45'
      [Sequence, {2}] '45'
        [Digit, {2}] '4'
        [Digit, {2}] '5'
    [FirstOf, {0}]


Enter a time expression (hh:mm(:ss)?, hh(mm(ss)?)? or h(mm)?, single RETURN to exit)!
23:14
23:14 = 23 h, 14 min, 0 s

[Time, {23 h, 14 min, 0 s}] '23:14'
  [Time_HH_MM_SS, {23 h, 14 min, 0 s}] '23:14'
    [OneOrTwoDigits, {23}] '23'
      [TwoDigits, {23}] '23'
        [Sequence] '23'
          [Digit] '2'
          [Digit] '3'
    [':', {23}] ':'
    [TwoDigits, {14}] '14'
      [Sequence, {23}] '14'
        [Digit, {23}] '1'
        [Digit, {23}] '4'
    [FirstOf, {0}]
    [EOI, {0}]
```
