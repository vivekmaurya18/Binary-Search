class capacityToShipWithinDDays{

    public static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = 1;
            int currentLoad = 0;

            for (int weight : weights) {

                if (currentLoad + weight <= mid) {
                    currentLoad += weight;
                } else {
                    requiredDays++;
                    currentLoad = weight;
                }
            }

            if (requiredDays <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    public static void main(String[] args) {

        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;

        System.out.println(shipWithinDays(weights, days));
    }
}