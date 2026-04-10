class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int len = students.length;
        Queue<Integer>  q= new LinkedList<>();
        for (int student : students)
            q.add(student);
        Stack<Integer> sandwichStack = new Stack<>();
        for (int i = len - 1; i >= 0; i--)
            sandwichStack.push(sandwiches[i]);
        int served = 0;
        while (!q.isEmpty() && served < q.size()) {
            if (sandwichStack.peek().equals(q.peek())) {
                sandwichStack.pop();
                q.poll();
                served = 0;
            } else {
                q.add(q.peek());
                q.poll();
                served++;
            }
        }
        return q.size();
    }
}