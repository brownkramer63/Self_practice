package CodingBatAP1;

public class Scoresclump {
    public static void main(String[] args) {

    }

    public boolean scoresClump(int[] scores) {
        int size = scores.length - 2;
        for (int i = 1; i < size; i++) {
            if (scores[i - 1] - scores[i] > 2 || scores[i + 1] - scores[i] > 2 || scores[i + 1] - scores[i+1] > 2) {
                return false;
            }

//return to this
        }
        return true;
    }
}