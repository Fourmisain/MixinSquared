package com.bawnorton.mixinsquared.mixinextras.injection.struct;

import com.bawnorton.mixinsquared.injection.struct.MixinSquaredInjectInfo;
import com.bawnorton.mixinsquared.mixinextras.injection.WrapWithConditionInHandler;
import com.llamalad7.mixinextras.injector.WrapWithConditionInjectionInfo;
import org.objectweb.asm.tree.AnnotationNode;
import org.objectweb.asm.tree.MethodNode;
import org.spongepowered.asm.mixin.injection.selectors.ITargetSelector;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo.AnnotationType;
import org.spongepowered.asm.mixin.injection.struct.InjectionInfo.HandlerPrefix;
import org.spongepowered.asm.mixin.transformer.MixinTargetContext;

import java.util.Set;

@AnnotationType(WrapWithConditionInHandler.class)
@HandlerPrefix("wrapWithConditionInHandler")
@SuppressWarnings("unused")
public class WrapWithConditionInHandlerInfo extends WrapWithConditionInjectionInfo implements MixinSquaredInjectInfo {
    public WrapWithConditionInHandlerInfo(MixinTargetContext mixin, MethodNode method, AnnotationNode annotation) {
        super(mixin, method, annotation);
    }


    @Override
    public void parseSelectors() {
        MixinSquaredInjectInfo.super.parseSelectors();
    }

    @Override
    public Set<ITargetSelector> getSelectors() {
        return selectors;
    }

    @Override
    public String getAnnotationType() {
        return annotationType;
    }
}
