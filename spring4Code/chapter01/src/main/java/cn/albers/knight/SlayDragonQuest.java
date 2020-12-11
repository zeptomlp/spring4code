package cn.albers.knight;

import cn.albers.knight.aspect.MinstrelNeeding;

import java.io.PrintStream;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
public class SlayDragonQuest implements Quest {

    private PrintStream printStream;

    public SlayDragonQuest(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    @MinstrelNeeding
    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!");
    }

}
