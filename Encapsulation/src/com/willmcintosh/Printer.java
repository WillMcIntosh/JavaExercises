package com.willmcintosh;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean isDuplex) {
        if (tonerLevel >=0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int amount) {
        // validate amount is a positive number
        if (amount > 0) {
            // cant fill more than 100 %
            if (this.getTonerLevel() + amount > 100) {
                this.setTonerLevel(100);
            } else {
                this.setTonerLevel(this.getTonerLevel() + amount);
            }
            System.out.println("Toner level is now at " + this.getTonerLevel() + "%");
        } else {
            System.out.println("Invalid amount of toner supplied.");
        }
    }

    public void printPages(int pages) {
        // check that pages is a positive number
        if (pages > 0) {
            // every 10 pages takes 1 % toner
            int newToner = this.getTonerLevel() - (pages/10);

            if (newToner >= 0) {
                // print normally if we have enough toner
                this.setTonerLevel(newToner);
                this.setNumberOfPagesPrinted( this.getNumberOfPagesPrinted() + pages);
                System.out.println("Printed " + pages + " pages. \n" +
                        "Total number of pages printed: " + this.getNumberOfPagesPrinted() );
                System.out.println("Toner Level at " + this.getTonerLevel() + "%");
            } else {
                //otherwise print what we can and msg to add more toner
                int pagesNotPrinted = Math.abs(newToner * 10);
                int pagesPrinted = pages - pagesNotPrinted;
                this.setTonerLevel(0);

                this.setNumberOfPagesPrinted( this.getNumberOfPagesPrinted() + pagesPrinted);
                System.out.println("Printed " + pagesPrinted + " pages. \n" +
                        "Total number of pages printed: " + this.getNumberOfPagesPrinted() +
                        "\nWarning: " + pagesNotPrinted + " pages were not printed.");

                System.out.println("Toner level is at 0%. Please add toner.");
            }

        } else {
            System.out.println("Invalid number of pages specified.");
        }

    }

    public int getTonerLevel() {
        // could display toner level in future with another method
        // and make this private
        return tonerLevel;
    }

    private void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    private void setNumberOfPagesPrinted(int numberOfPagesPrinted) {
        this.numberOfPagesPrinted = numberOfPagesPrinted;
    }
}
