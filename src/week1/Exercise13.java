package week1;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Exercise13 {
        public static void main(String[] args)throws Exception{
            System.out.println("Top ten by goals");
            NHLStatistics.sortByGoals();
            NHLStatistics.top(10);

            System.out.println("*************************");

            System.out.println("Top 25 by penalty amounts");
            NHLStatistics.sortByPenalties();
            NHLStatistics.top(25);

            System.out.println("*************************");

            System.out.println("Statistics for Sidney Crosby");
            NHLStatistics.searchByPlayer("Sidney crosby");

            System.out.println("*************************");

            System.out.println("Statistics for Philadelphia Flyers");
            NHLStatistics.teamStatistics("PHI"); // imi apar 2 care nu au phi la echipa

            System.out.println("*************************");

            System.out.println("Players in Anaheim Ducks");
            NHLStatistics.teamStatistics("ANA");
            NHLStatistics.sortByPoints();



        }
    }
