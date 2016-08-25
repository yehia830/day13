package tiy.pink;

/**
 * Created by Yehia830 on 8/24/16.
 */
public class cocoSolver {
    public int makeChocolate(int small, int big, int chocGoal) {
        if(chocGoal<5&&small>=chocGoal)
        {
            return chocGoal;
        }

        if(chocGoal<5&&small<chocGoal)
        {
            return -1;
        }

        if(chocGoal>=5)
        {
            if(5 * big > chocGoal)
            {
                int flag = chocGoal/5;
                if(chocGoal - flag * 5 <= small)
                {
                    return chocGoal-flag*5;
                }
                if(chocGoal - flag * 5 > small)
                {
                    return -1;
                }
            }

            if(5*big<chocGoal)
            {
                if(small <(chocGoal -5 * big))
                {
                    return -1;
                }
                if(small>=(chocGoal-5*big))
                {
                    return chocGoal-5*big;
                }
            }
        }
        return 0;


    }
}

