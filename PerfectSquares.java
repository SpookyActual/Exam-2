
public class PerfectSquares {
    
}
/*
Identify the problem: Given a postive integer n, we need to find the least possible nubmer of perfect squares that sum to n.
Define the goal: We take number n, count up to n and take note of each number that is a perfect square. We then add each number noted to itself recursively until we either reach n or pass it. 
    If we land on N, we store the number of recursive calls it took to reach n, and then we begin adding eaching number to another, recursively trying a combination of the two numbers, again keeping count. We compare each final count once found and eliminate the alrger counts until we have exhausted all possible combinations.
    HOWEVER, if we ever hit a count of 2, we stop, assuming that integer n can not sum to itself in spite of the fact it is a perfect square (example, given 9, we can not have a count of 1 via 9=9, we must have a count of 3 via 4+4+1=9
Explore all solutions: Using an array to store each perfect square found on the count to integer n, solving our storage problem. And we simply use a single integer count that is recursively returned to a compare class, which then sets counter as the smallest of the counters returned. 
Anticipating outcomes and acting: Again, noting that if a count of 2 is ever returned, we return it automatically.
Look and Learn: I wasn't able to come up with the code myself, even though I know (and found) it wasn't lengthy or difficult, I just wasn't able to come to a conclusion myself.
*/