package QuizProjectJava;

import java.util.Scanner;

public class QuestionQuiz {
    Scanner sc = new Scanner(System.in);
    static int life_line_count = 2;
    static int ff = 1;
    static int ap = 1;

    boolean question1(Candidate c) {
        String question1 = "1. Which is the capital of India?";
        System.out.println(question1 + " \n Select the correct option");
        System.out.println("1. Karnataka\n"
                + "2. Tamil Nadu\n"
                + "3. New Delhi\n"
                + "4. Jammu\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 3) {
            return true;
        } else if (opt == 5) {
            life_line_count--;
            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;
                    System.out.println("1. Karnataka\n"
                            + "3. New Delhi\n");
                    opt = sc.nextInt();
                    if (opt == 3) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (opt1 == 2) {
                    ap--;
                    System.out.println("1. Karnataka --> 25%\n"
                            + "2. Tamil Nadu --> 20%\n"
                            + "3. New Delhi --> 35%\n"
                            + "4. Jammu --> 20%\n");
                    opt = sc.nextInt();
                    if (opt == 3) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } else {
            return false;
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question2(Candidate c) {
        String question2 = "2. Who is the founder of Codegnan Destination?";
        System.out.println(question2 + " \n Select the correct option");
        System.out.println("1. Deepak\n"
                + "2. Nikitha\n"
                + "3. Beemesh\n"
                + "4. Sanjay\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 1) {
            return true;
        } else if (opt == 5) {
            life_line_count--;
            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == 0) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. Deepak --> 35%\n"
                                    + "2. Nikitha --> 20%\n"
                                    + "3. Beemesh --> 25%\n"
                                    + "4. Sanjay --> 20%\n");
                            opt = sc.nextInt();
                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -1) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question2 + " \n Select the correct option");
                            System.out.println("1. Deepak\n"
                                    + "2. Nikitha\n"
                                    + "3. Beemesh\n"
                                    + "4. Sanjay\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question2 + " \n Select the correct option");
                            System.out.println("1. Deepak\n"
                                    + "2. Nikitha\n"
                                    + "3. Beemesh\n"
                                    + "4. Sanjay\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }

                    System.out.println("1. Deepak\n" + "2. Nikitha\n");
                    opt = sc.nextInt();

                    if (opt == 1) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == 0) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("1. Deepak\n"
                                    + "2. Nikitha\n");
                            opt = sc.nextInt();
                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -1) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question2 + " \n Select the correct option");
                            System.out.println("1. Deepak\n"
                                    + "2. Nikitha\n"
                                    + "3. Beemesh\n"
                                    + "4. Sanjay\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question2 + " \n Select the correct option");
                            System.out.println("1. Deepak\n"
                                    + "2. Nikitha\n"
                                    + "3. Beemesh\n"
                                    + "4. Sanjay\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Deepak --> 35%\n"
                            + "2. Nikitha --> 20%\n"
                            + "3. Beemesh --> 25%\n"
                            + "4. Sanjay --> 20%\n");
                    opt = sc.nextInt();

                    if (opt == 1) {
                        return true;
                    }
                }
            }
        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question2 + " \n Select the correct option");
                System.out.println("1. Deepak\n"
                        + "2. Nikitha\n"
                        + "3. Beemesh\n"
                        + "4. Sanjay\n");
                opt = sc.nextInt();

                if (opt == 1) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question2 + " \n Select the correct option");
            System.out.println("1. Deepak\n"
                    + "2. Nikitha\n"
                    + "3. Beemesh\n"
                    + "4. Sanjay\n");
            opt = sc.nextInt();

            if (opt == 1) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question3(Candidate c) {
        String question3 = "3. Which planet is known as the Red Planet?";
        System.out.println(question3 + " \n Select the correct option");
        System.out.println("1. Earth\n"
                + "2. Mars\n"
                + "3. Jupiter\n"
                + "4. Venus\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 2) {
            return true;
        } else if (opt == 5) {
            // Life line logic here
            life_line_count--;

            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == -1) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. Earth --> 35%\n"
                                    + "2. Mars --> 20%\n"
                                    + "3. Jupiter --> 25%\n"
                                    + "4. Venus --> 20%\n");
                            opt = sc.nextInt();
                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question3 + " \n Select the correct option");
                            System.out.println("1. Earth\n"
                                    + "2. Mars\n"
                                    + "3. Jupiter\n"
                                    + "4. Venus\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question3 + " \n Select the correct option");
                            System.out.println("1. Earth\n"
                                    + "2. Mars\n"
                                    + "3. Jupiter\n"
                                    + "4. Venus\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("2. Mars\n"
                            + "4. Venus\n");
                    opt = sc.nextInt();

                    if (opt == 2) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == -1) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("2. Mars\n"
                                    + "4. Venus\n");
                            opt = sc.nextInt();
                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question3 + " \n Select the correct option");
                            System.out.println("1. Earth\n"
                                    + "2. Mars\n"
                                    + "3. Jupiter\n"
                                    + "4. Venus\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question3 + " \n Select the correct option");
                            System.out.println("1. Earth\n"
                                    + "2. Mars\n"
                                    + "3. Jupiter\n"
                                    + "4. Venus\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Earth --> 35%\n"
                            + "2. Mars --> 20%\n"
                            + "3. Jupiter --> 25%\n"
                            + "4. Venus --> 20%\n");
                    opt = sc.nextInt();

                    if (opt == 2) {
                        return true;
                    }
                }
            }

        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question3 + " \n Select the correct option");
                System.out.println("1. Earth\n"
                        + "2. Mars\n"
                        + "3. Jupiter\n"
                        + "4. Venus\n");
                opt = sc.nextInt();

                if (opt == 2) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question3 + " \n Select the correct option");
            System.out.println("1. Earth\n"
                    + "2. Mars\n"
                    + "3. Jupiter\n"
                    + "4. Venus\n");
            opt = sc.nextInt();

            if (opt == 2) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question4(Candidate c) {
        String question4 = "4. What is the chemical symbol for water?";
        System.out.println(question4 + " \n Select the correct option");
        System.out.println("1. H2O\n"
                + "2. O2\n"
                + "3. CO2\n"
                + "4. H2\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 1) {
            return true;
        } else if (opt == 5) {
            // Life line logic here
            life_line_count--;

            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == -1) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. H2O --> 20%\n"
                                    + "2. O2 --> 35%\n"
                                    + "3. CO2 --> 20%\n"
                                    + "4. H2 --> 25%\n"
                                    + "5. Life Line");
                            opt = sc.nextInt();
                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question4 + " \n Select the correct option");
                            System.out.println("1. H2O\n"
                                    + "2. O2\n"
                                    + "3. CO2\n"
                                    + "4. H2\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question4 + " \n Select the correct option");
                            System.out.println("1. H2O\n"
                                    + "2. O2\n"
                                    + "3. CO2\n"
                                    + "4. H2\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. H2O\n"
                            + "2. O2\n");
                    opt = sc.nextInt();

                    if (opt == 1) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == -1) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("1. H2O\n"
                                    + "2. O2\n");
                            opt = sc.nextInt();
                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question4 + " \n Select the correct option");
                            System.out.println("1. H2O\n"
                                    + "2. O2\n"
                                    + "3. CO2\n"
                                    + "4. H2\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question4 + " \n Select the correct option");
                            System.out.println("1. H2O\n"
                                    + "2. O2\n"
                                    + "3. CO2\n"
                                    + "4. H2\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. H2O --> 20%\n"
                            + "2. O2 --> 35%\n"
                            + "3. CO2 --> 20%\n"
                            + "4. H2 --> 25%\n");
                    opt = sc.nextInt();

                    if (opt == 1) {
                        return true;
                    }
                }
            }

        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question4 + " \n Select the correct option");
                System.out.println("1. H2O\n"
                        + "2. O2\n"
                        + "3. CO2\n"
                        + "4. H2\n");
                opt = sc.nextInt();

                if (opt == 1) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question4 + " \n Select the correct option");
            System.out.println("1. H2O\n"
                    + "2. O2\n"
                    + "3. CO2\n"
                    + "4. H2\n");
            opt = sc.nextInt();

            if (opt == 1) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question5(Candidate c) {
        String question5 = "5. Who wrote 'Romeo and Juliet'?";
        System.out.println(question5 + " \n Select the correct option");
        System.out.println("1. Charles Dickens\n"
                + "2. William Shakespeare\n"
                + "3. J.K. Rowling\n"
                + "4. Mark Twain\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 2) {
            return true;
        } else if (opt == 5) {
            // Life line logic here
            life_line_count--;

            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == -1) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. Charles Dickens --> 35%\n"
                                    + "2. William Shakespeare --> 20%\n"
                                    + "3. J.K. Rowling --> 25%\n"
                                    + "4. Mark Twain --> 20%\n");
                            opt = sc.nextInt();
                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question5 + " \n Select the correct option");
                            System.out.println("1. Charles Dickens\n"
                                    + "2. William Shakespeare\n"
                                    + "3. J.K. Rowling\n"
                                    + "4. Mark Twain\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question5 + " \n Select the correct option");
                            System.out.println("1. Charles Dickens\n"
                                    + "2. William Shakespeare\n"
                                    + "3. J.K. Rowling\n"
                                    + "4. Mark Twain\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("2. William Shakespeare\n"
                            + "4. Mark Twain\n");
                    opt = sc.nextInt();

                    if (opt == 2) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == -1) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("2. William Shakespeare\n"
                                    + "4. Mark Twain\n");
                            opt = sc.nextInt();
                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question5 + " \n Select the correct option");
                            System.out.println("1. Charles Dickens\n"
                                    + "2. William Shakespeare\n"
                                    + "3. J.K. Rowling\n"
                                    + "4. Mark Twain\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question5 + " \n Select the correct option");
                            System.out.println("1. Charles Dickens\n"
                                    + "2. William Shakespeare\n"
                                    + "3. J.K. Rowling\n"
                                    + "4. Mark Twain\n");
                            opt = sc.nextInt();

                            if (opt == 2) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Charles Dickens --> 35%\n"
                            + "2. William Shakespeare --> 20%\n"
                            + "3. J.K. Rowling --> 25%\n"
                            + "4. Mark Twain --> 20%\n");
                    opt = sc.nextInt();

                    if (opt == 2) {
                        return true;
                    }
                }
            }

        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question5 + " \n Select the correct option");
                System.out.println("1. Charles Dickens\n"
                        + "2. William Shakespeare\n"
                        + "3. J.K. Rowling\n"
                        + "4. Mark Twain\n");
                opt = sc.nextInt();

                if (opt == 2) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question5 + " \n Select the correct option");
            System.out.println("1. Charles Dickens\n"
                    + "2. William Shakespeare\n"
                    + "3. J.K. Rowling\n"
                    + "4. Mark Twain\n");
            opt = sc.nextInt();

            if (opt == 2) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question6(Candidate c) {
        String question6 = "6. Which gas is most abundant in the Earth's atmosphere?";
        System.out.println(question6 + " \n Select the correct option");
        System.out.println("1. Oxygen\n"
                + "2. Hydrogen\n"
                + "3. Carbon Dioxide\n"
                + "4. Nitrogen\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 4) {
            return true;
        } else if (opt == 5) {
            // Life line logic here
            life_line_count--;

            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == -1) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. Oxygen --> 35%\n"
                                    + "2. Hydrogen --> 20%\n"
                                    + "3. Carbon Dioxide --> 25%\n"
                                    + "4. Nitrogen --> 20%\n");
                            opt = sc.nextInt();
                            if (opt == 4) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question6 + " \n Select the correct option");
                            System.out.println("1. Oxygen\n"
                                    + "2. Hydrogen\n"
                                    + "3. Carbon Dioxide\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 4) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question6 + " \n Select the correct option");
                            System.out.println("1. Oxygen\n"
                                    + "2. Hydrogen\n"
                                    + "3. Carbon Dioxide\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 4) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Oxygen\n"
                            + "4. Nitrogen\n");
                    opt = sc.nextInt();

                    if (opt == 4) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == -1) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("1. Oxygen\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();
                            if (opt == 4) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question6 + " \n Select the correct option");
                            System.out.println("1. Oxygen\n"
                                    + "2. Hydrogen\n"
                                    + "3. Carbon Dioxide\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 4) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question6 + " \n Select the correct option");
                            System.out.println("1. Oxygen\n"
                                    + "2. Hydrogen\n"
                                    + "3. Carbon Dioxide\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 4) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Oxygen --> 35%\n"
                            + "2. Hydrogen --> 20%\n"
                            + "3. Carbon Dioxide --> 25%\n"
                            + "4. Nitrogen --> 20%\n");
                    opt = sc.nextInt();

                    if (opt == 4) {
                        return true;
                    }
                }
            }

        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question6 + " \n Select the correct option");
                System.out.println("1. Oxygen\n"
                        + "2. Hydrogen\n"
                        + "3. Carbon Dioxide\n"
                        + "4. Nitrogen\n");
                opt = sc.nextInt();

                if (opt == 4) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question6 + " \n Select the correct option");
            System.out.println("1. Oxygen\n"
                    + "2. Hydrogen\n"
                    + "3. Carbon Dioxide\n"
                    + "4. Nitrogen\n");
            opt = sc.nextInt();

            if (opt == 4) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question7(Candidate c) {
        String question7 = "7. Who painted the Mona Lisa?";
        System.out.println(question7 + " \n Select the correct option");
        System.out.println("1. Leonardo da Vinci\n"
                + "2. Pablo Picasso\n"
                + "3. Vincent van Gogh\n"
                + "4. Michelangelo\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 1) {
            return true;
        } else if (opt == 5) {
            // Life line logic here
            life_line_count--;

            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == -1) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. Leonardo da Vinci --> 35%\n"
                                    + "2. Pablo Picasso --> 20%\n"
                                    + "3. Vincent van Gogh --> 25%\n"
                                    + "4. Michelangelo --> 20%\n");
                            opt = sc.nextInt();
                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question7 + " \n Select the correct option");
                            System.out.println("1. Leonardo da Vinci\n"
                                    + "2. Pablo Picasso\n"
                                    + "3. Vincent van Gogh\n"
                                    + "4. Michelangelo\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question7 + " \n Select the correct option");
                            System.out.println("1. Leonardo da Vinci\n"
                                    + "2. Pablo Picasso\n"
                                    + "3. Vincent van Gogh\n"
                                    + "4. Michelangelo\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Leonardo da Vinci\n"
                            + "2. Pablo Picasso\n");
                    opt = sc.nextInt();

                    if (opt == 1) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == -1) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("1. Leonardo da Vinci\n"
                                    + "2. Pablo Picasso\n");
                            opt = sc.nextInt();
                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question7 + " \n Select the correct option");
                            System.out.println("1. Leonardo da Vinci\n"
                                    + "2. Pablo Picasso\n"
                                    + "3. Vincent van Gogh\n"
                                    + "4. Michelangelo\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question7 + " \n Select the correct option");
                            System.out.println("1. Leonardo da Vinci\n"
                                    + "2. Pablo Picasso\n"
                                    + "3. Vincent van Gogh\n"
                                    + "4. Michelangelo\n");
                            opt = sc.nextInt();

                            if (opt == 1) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Leonardo da Vinci --> 35%\n"
                            + "2. Pablo Picasso --> 20%\n"
                            + "3. Vincent van Gogh --> 25%\n"
                            + "4. Michelangelo --> 20%\n");
                    opt = sc.nextInt();

                    if (opt == 1) {
                        return true;
                    }
                }
            }

        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question7 + " \n Select the correct option");
                System.out.println("1. Leonardo da Vinci\n"
                        + "2. Pablo Picasso\n"
                        + "3. Vincent van Gogh\n"
                        + "4. Michelangelo\n");
                opt = sc.nextInt();

                if (opt == 1) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question7 + " \n Select the correct option");
            System.out.println("1. Leonardo da Vinci\n"
                    + "2. Pablo Picasso\n"
                    + "3. Vincent van Gogh\n"
                    + "4. Michelangelo\n");
            opt = sc.nextInt();

            if (opt == 1) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }

    // ----------------------------------------------------------
    boolean question8(Candidate c) {
        String question8 = "8. Which element has the atomic number 1?";
        System.out.println(question8 + " \n Select the correct option");
        System.out.println("1. Helium\n"
                + "2. Oxygen\n"
                + "3. Hydrogen\n"
                + "4. Nitrogen\n"
                + "5. Life Line");
        int opt = sc.nextInt();
        if (opt == 3) {
            return true;
        } else if (opt == 5) {
            // Life line logic here
            life_line_count--;

            if (ff == 1 || ap == 1) {
                System.out.println("1. 50 - 50\n"
                        + "2. Audience Poll\n "
                        + "Select your option");
                int opt1 = sc.nextInt();
                if (opt1 == 1) {
                    ff--;

                    if (ff == -1) {
                        System.out.println("You don't have 50 - 50 Option Click 2--> for Audiance Poll");
                        int opt2 = sc.nextInt();
                        if (opt2 == 2) {
                            System.out.println("1. Helium --> 35%\n"
                                    + "2. Oxygen --> 20%\n"
                                    + "3. Hydrogen --> 25%\n"
                                    + "4. Nitrogen --> 20%\n");
                            opt = sc.nextInt();
                            if (opt == 3) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ff == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question8 + " \n Select the correct option");
                            System.out.println("1. Helium\n"
                                    + "2. Oxygen\n"
                                    + "3. Hydrogen\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 3) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question8 + " \n Select the correct option");
                            System.out.println("1. Helium\n"
                                    + "2. Oxygen\n"
                                    + "3. Hydrogen\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 3) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Helium\n"
                            + "3. Hydrogen\n");
                    opt = sc.nextInt();

                    if (opt == 3) {
                        return true;
                    }

                } else if (opt1 == 2) {
                    ap--;

                    if (ap == -1) {
                        System.out.println("You don't have Audiance Poll Option Click 1--> for 50 - 50");
                        int opt2 = sc.nextInt();
                        if (opt2 == 1) {
                            System.out.println("1. Helium\n"
                                    + "3. Hydrogen\n");
                            opt = sc.nextInt();
                            if (opt == 3) {
                                return true;
                            } else {
                                return false;
                            }
                        }
                    } else if (ap == -2) {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question8 + " \n Select the correct option");
                            System.out.println("1. Helium\n"
                                    + "2. Oxygen\n"
                                    + "3. Hydrogen\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 3) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    } else {
                        System.out.println("Your Life-Line has been Exhaust");
                        System.out.println("To Continue Click 1--> Without LifeLine");
                        int opt3 = sc.nextInt();
                        if (opt3 == 1) {
                            System.out.println(question8 + " \n Select the correct option");
                            System.out.println("1. Helium\n"
                                    + "2. Oxygen\n"
                                    + "3. Hydrogen\n"
                                    + "4. Nitrogen\n");
                            opt = sc.nextInt();

                            if (opt == 3) {
                                return true;
                            } else {
                                return false;
                                // System.exit(0);
                            }
                        }
                        return false;
                    }
                    // System.out.println(ff);

                    System.out.println("1. Helium --> 35%\n"
                            + "2. Oxygen --> 20%\n"
                            + "3. Hydrogen --> 25%\n"
                            + "4. Nitrogen --> 20%\n");
                    opt = sc.nextInt();

                    if (opt == 3) {
                        return true;
                    }
                }
            }

        } else {
            System.out.println("Your Life-Line has been Exhaust");
            System.out.println("To Continue Click 1--> Without LifeLine");
            int opt3 = sc.nextInt();
            if (opt3 == 1) {
                System.out.println(question8 + " \n Select the correct option");
                System.out.println("1. Helium\n"
                        + "2. Oxygen\n"
                        + "3. Hydrogen\n"
                        + "4. Nitrogen\n");
                opt = sc.nextInt();

                if (opt == 3) {
                    return true;
                } else {
                    return false;
                    // System.exit(0);
                }
            }
            return false;
        }
        System.out.println("Your Life-Line has been Exhaust");
        System.out.println("To Continue Click 1--> Without LifeLine");
        int opt3 = sc.nextInt();
        if (opt3 == 1) {
            System.out.println(question8 + " \n Select the correct option");
            System.out.println("1. Helium\n"
                    + "2. Oxygen\n"
                    + "3. Hydrogen\n"
                    + "4. Nitrogen\n");
            opt = sc.nextInt();

            if (opt == 3) {
                return true;
            } else {
                return false;
                // System.exit(0);
            }
        }
        return false;
    }
}
