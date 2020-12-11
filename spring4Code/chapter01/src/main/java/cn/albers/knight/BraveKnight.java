package cn.albers.knight;
/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
