# Problem Statement
In a galaxy far far away... each week has N days.  
Luke Skywalker has exactly N shirts.  
The shirts are numbered 1 through N.  
Each day he wears one of those N shirts.  
Each week he wears each shirt exactly once.  

In different weeks Luke may wear his shirts in different orders.  
However, not all orders are always possible.  
Whenever Luke wears a shirt for a day, he has to wash it before he can use it again.  
Washing and drying a shirt takes D-1 full days.  
In other words, if he wears a shirt on day x, the earliest day when he can wear it again is day x+D.  

Master Yoda recently sent Luke on a training mission that lasted for some unknown number of full N-day weeks. He remembers the order in which he wore his shirts during the first week of the mission. He also remembers the order in which he wore his shirts during the last week of the mission. You are given this information in s firstWeek and lastWeek. Each of these s contains N elements: the numbers of shirts he wore during that week, in order. You are also given the number of days D that it takes to wash a shirt.  

For example, assume that N = 4, firstWeek = {1,2,3,4}, and lastWeek = {4,3,2,1} and D = 3. It is possible that this particular mission took four weeks. One possible order in which Luke could have worn his shirts looks as follows:  
* week 1: {1,2,3,4}
* week 2: {2,3,4,1}
* week 3: {3,4,2,1}
* week 4: {4,3,2,1}
Given firstWeek, lastWeek and D, compute and return the smallest number of weeks the mission could have taken.  

# Definition
Class: ANewHope  
Method: count  
Parameters: int[], int[], int  
Returns: int  
Method signature: int count(int[] firstWeek, int[] lastWeek, int D)  
(be sure your method is public)

# Limits
Time limit (s): 2.000  
Memory limit (MB): 256  

# Notes
- N can be calculated as the number of elements of firstWeek

# Constraints
- firstWeek will contain between 2 and 2500 integers inclusive.
- firstWeek and lastWeek will contain the same number of elements.
- firstWeek and lastWeek will represent permutations of the first N positive integers.
- D will be between 1 and N-1 inclusive.

# Examples
0)  
{1,2,3,4}  
{4,3,2,1}  
3  
Returns: 4  
The example from the problem statement.  
1)  
{8,5,4,1,7,6,3,2}  
{2,4,6,8,1,3,5,7}  
3  
Returns: 3  
2)  
{1,2,3,4}  
{1,2,3,4}  
2  
Returns: 1  
Be careful, the first week and the last week can be the same week.
