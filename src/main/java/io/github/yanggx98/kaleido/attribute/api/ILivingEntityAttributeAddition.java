package io.github.yanggx98.kaleido.attribute.api;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.minecraft.entity.attribute.DefaultAttributeContainer;

public interface ILivingEntityAttributeAddition {
    Event<ILivingEntityAttributeAddition> EVENT = EventFactory.createArrayBacked(ILivingEntityAttributeAddition.class, callbacks -> (ILivingEntityAttributeAddition) builder -> {
        for (ILivingEntityAttributeAddition callback : callbacks) {
            callback.addAttribute(builder);
        }
    });

    void addAttribute(DefaultAttributeContainer.Builder builder);

    interface IMobEntityAttributeAddition extends ILivingEntityAttributeAddition {
    }

    interface IPlayerEntityAttributeAddition extends ILivingEntityAttributeAddition {
    }
}

