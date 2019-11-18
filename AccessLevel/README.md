# Problem Statement
In many computer systems and networks, different users are granted different levels of access to different resources. In this case, you are given a rights, indicating the privilege level of each user to use some system resource. You are also given a minPermission, which is the minimum permission a user must have to use this resource.  
You are to return a indicating which users can and cannot access this resource. Each character in the return value corresponds to the element of users with the same index. 'A' indicates the user is allowed access, while 'D' indicates the user is denied access.

# Definition
* Class: AccessLevel
* Method: canAccess
* Parameters: int[], int
* Returns: String
* Method signature: String canAccess(int[] rights, int minPermission)
    (be sure your method is public)
    
# Limits
* Time limit (s): 840.000
* Memory limit (MB): 64

# Notes
If users is empty, then a zero-length ("") should be returned.

# Constraints
- users will contain between 0 and 50 elements, inclusive.
- Each element of users will be between 0 and 100, inclusive.
- minPermission will be between 0 and 100, inclusive.

# Example
0) 　  
    {0,1,2,3,4,5}  
    2  
    Returns: "DDAAAA"  
    Here, the first two users don't have sufficient privileges, but the remainder do.
1) 　  
    {5,3,2,10,0}  
    20  
    Returns: "DDDDD"  
    Unfortunately, nobody has sufficient access.
2) 　  
    {}  
    20  
    Returns: ""  
    It makes no difference what permission is required, since there are no users to check.
3) 　  
    {34,78,9,52,11,1}  
    49  
    Returns: "DADADD"  
This problem statement is the exclusive and proprietary property of TopCoder, Inc. Any unauthorized use or reproduction of this information without the prior written consent of TopCoder, Inc. is strictly prohibited. (c)2003, TopCoder, Inc. All rights reserved.
