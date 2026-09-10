public class ValidSukodo {

    static boolean isBoxValid(char[][] sudoko, int x, int y) {
        int[] sastaHash = new int[9];

        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                if (sudoko[i][j] != '.') {
                    sastaHash[sudoko[i][j] - '1']++;
                    if (sastaHash[sudoko[i][j] - '1'] > 1) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    static boolean isValid(char[][] sudoko) {
        for (int i = 0; i < sudoko.length; i++) {
            int[] sastaHash = new int[9];

            for (int j = 0; j < sudoko[0].length; j++) {
                if (sudoko[i][j] != '.') {
                    sastaHash[sudoko[i][j] - '1']++;
                    if (sastaHash[sudoko[i][j] - '1'] > 1) {
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < sudoko.length; i++) {
            int[] sastaHash = new int[9];

            for (int j = 0; j < sudoko[0].length; j++) {
                if (sudoko[j][i] != '.') {
                    sastaHash[sudoko[j][i] - '1']++;
                    if (sastaHash[sudoko[j][i] - '1'] > 1) {
                        return false;
                    }
                }

            }
        }

        int x = 0;
        int y = 0;

        while (x < 9 && y < 9) {
            if (!isBoxValid(sudoko, x, y)) {
                return false;
            }
            ;

            y += 3;

            if (y >= 8) {
                x += 3;
                y = 0;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        char[][] sudoko = {
                { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
                { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '9', '1', '.', '.', '.', '.', '.', '3' },
                { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
                { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        char[][] sudoko2 = {
                { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
                { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
                { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
                { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println(isValid(sudoko));
        System.out.println(isValid(sudoko2));
    }
}
