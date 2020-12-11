package cn.albers.knight;

import lombok.Getter;
import lombok.Setter;

/**
 * @version: V1.0
 * @author: Albers
 * @date: 2020/10/19
 * @description:
 */
@Getter
@Setter
public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }//紧耦合

    @Override
    public void embarkOnQuest() {
        quest.embark();
    }

}
