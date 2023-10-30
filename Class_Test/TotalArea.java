public class TotalArea {
    public static void main(String[] args) {
        Circle[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
        // Radius                        Area
        // 96.76362980433149             29415.360500312705
        // 56.81771677365004             10141.85571825669
        // 52.10259842269921             8528.421139988137
        // 29.22747762799115             2683.69122535354
        // 17.673643044084               981.3005250780832
        // _______________________________
        // The total area of circles is  51750.62910898916
    }

    public static Circle[] createCircleArray() {
        Circle[] circleArray = new Circle[5];
        for (int i = 0; i < circleArray.length; ++i) {
            circleArray[i] = new Circle(Math.random() * 100);
        }
        return circleArray;
    }

    public static void printCircleArray(Circle[] circleArray) {
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; ++i) {
            System.out.printf("%-30s%-15s\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("_______________________________");
        System.out.printf("%-30s%-15s\n", "The total area of circles is ", sum(circleArray));
    }

    public static double sum(Circle[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; ++i) {
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
