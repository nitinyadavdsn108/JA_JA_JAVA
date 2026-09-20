import java.util.ArrayList;
import java.util.List;

class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        List<int[]> subarr = new ArrayList<>();
        int start = 0;
        int end = 0;
        int length = 1;
        int sum = arr[0];
        // we will find all possible subarrays in this section
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                start = i;
                end = i;
                subarr.add(new int[] { start, end, 1 });
                continue;
            }
            if (i != n) {
                int j = i + 1;

                if (j == n - 1) {
                    sum = arr[i] + arr[j];
                    if (sum == target) {
                        start = i;
                        end = j;
                        length = j - i + 1;
                        subarr.add(new int[] { start, end, length });
                    }
                } else if (j < n) {
                    sum = arr[i];
                    while (sum < target && j < n) {
                        sum += arr[j++];
                    }
                    if (sum == target) {
                        start = i;
                        end = j;
                        length = j - i ;
                        subarr.add(new int[] { start, end, length });
                    }
                }

            } else {

                if (arr[i] == target) {
                    start = i;
                    end = i;
                    subarr.add(new int[] { start, end, 1 });
                    continue;
                }
            }

        }

        // before going to fin minlen let us seee wheather list contINS ANY SUBARRAYS more then 2 in number
        if (subarr.size() < 2) {
            return -1;
        }

        // to find minlen get the first two subarrays from list
        int[] a = subarr.get(0);
        int[] b = subarr.get(1);
        int minlen = a[2] + b[2];
        boolean isNonOverlapping = false;
        for (int i = 0; i < subarr.size(); i++) {
            a = subarr.get(i);
            for (int j = i + 1; j < subarr.size(); j++) {
                b = subarr.get(j);
                //  if a's end is less then b's start then they would be non-overlapping arrays
                if (a[1] < b[0]) {
                    isNonOverlapping = true;
                    sum = a[2] + b[2];
                    if (sum < minlen) {
                        minlen = sum;
                    }
                }
            }
        }

        if (isNonOverlapping) {

            return minlen;
        } else {
            return -1;
        }

    }
}