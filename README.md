# Dynamic-Planning
# This is my first time to sovle problems about dynamic planning and this algorithm is ingenious as I think.
# We can use f(i) refering to the max sum of the sub-array which is ended with nums[i] and f(i) can be expressed as : f(i) = max(f(i - 1) + nums[i], nums[i])
# When we get all f(i)'s, we have to find the max f(i) which is the answer. Therefore, every time we calculate the f(i), we will compare f(i - 1) to f(i) and the bigger one will be regarded as the temporary answer. 
