
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int f : freq) {
            if (f > 0) {
                pq.offer(f);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int cycle = n + 1;

            for (int i = 0; i < cycle; i++) {
                if (!pq.isEmpty()) {
                    int f = pq.poll();
                    f--;

                    if (f > 0) {
                        temp.add(f);
                    }
                }

                time++;

                if (pq.isEmpty() && temp.isEmpty()) {
                    break;
                }
            }

            for (int f : temp) {
                pq.offer(f);
            }
        }

        return time;
    }
}