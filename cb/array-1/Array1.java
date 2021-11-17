public class Array1 {
    // This contains all of our solutions to Arrays-1
    public boolean firstLast6(int[] nums) {
        return (nums[0] == 6) || (nums[nums.length - 1] == 6);
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length > 0 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        int[] a = {
            3,
            1,
            4
        };
        return a;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0]) || (a[a.length - 1] == b[b.length - 1]);
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        int temp = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = temp;
        return nums;

    }

    public int[] reverse3(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[2];
        nums[2] = temp;
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max = nums[0];
        if (nums[nums.length - 1] > max) {
            max = nums[nums.length - 1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = max;
        }
        return nums;
    }

    public int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return 0;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] middles = new int[2];
        middles[0] = a[1];
        middles[1] = b[1];
        return middles;
    }

    public int[] makeEnds(int[] nums) {
        int[] firstLast = new int[2];
        firstLast[0] = nums[0];
        firstLast[1] = nums[nums.length - 1];
        return firstLast;
    }

    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3);
    }

    public boolean no23(int[] nums) {
        return (nums[0] != 2 && nums[0] != 3) && (nums[1] != 2 && nums[1] != 3);
    }

    public int[] makeLast(int[] nums) {
        int[] out = new int[nums.length * 2];
        out[out.length - 1] = nums[nums.length - 1];
        return out;
    }

    public boolean double23(int[] nums) {
        if (nums.length < 2)
            return false;

        if (nums[0] == nums[1]) {
            if (nums[0] == 2 || nums[0] == 3)
                return true;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3)
            nums[1] = 0;
        if (nums[1] == 2 && nums[2] == 3)
            nums[2] = 0;
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1)
            count++;
        if (b.length > 0 && b[0] == 1)
            count++;
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int maxA = a[0] + a[1];
        int maxB = b[0] + b[1];
        if (maxB > maxA) {
            return b;
        }
        return a;
    }

    public int[] makeMiddle(int[] nums) {
        int[] a = new int[2];
        a[0] = nums[nums.length / 2 - 1];
        a[1] = nums[nums.length / 2];
        return a;

    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] out = new int[4];
        out[0] = a[0];
        out[1] = a[1];
        out[2] = b[0];
        out[3] = b[1];
        return out;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        int[] out = new int[3];
        out[0] = nums[mid - 1];
        out[1] = nums[mid];
        out[2] = nums[mid + 1];
        return out;
    }

    public int maxTriple(int[] nums) {
        int max = nums[0];
        if (nums[nums.length / 2] > max)
            max = nums[nums.length / 2];
        if (nums[nums.length - 1] > max)
            return nums[nums.length - 1];
        return max;
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length < 2)
            return nums;

        int[] out = new int[2];
        out[0] = nums[0];
        out[1] = nums[1];
        return out;
    }

    public boolean unlucky1(int[] nums) {
        if (nums.length == 2)
            return (nums[0] == 1 && nums[1] == 3);
        if (nums.length < 2)
            return false;
        if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
            return true;
        if (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)
            return true;
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] out = new int[2];
        if (a.length == 1) {
            out[0] = a[0];
            out[1] = b[0];
            return out;
        }
        if (a.length >= 2) {
            out[0] = a[0];
            out[1] = a[1];
            return out;
        }
        return b;
    }

    public int[] front11(int[] a, int[] b) {
        int index = 0;
        int count = 0;
        int[] firsts = new int[2];

        if (a.length > 0) {
            firsts[index] = a[0];
            index++;
            count++;
        }
        if (b.length > 0) {
            firsts[index] = b[0];
            index++;
            count++;
        }

        int[] out = new int[count];
        for (int i = 0; i < count; i++) {
            out[i] = firsts[i];
        }

        return out;
    }



}
