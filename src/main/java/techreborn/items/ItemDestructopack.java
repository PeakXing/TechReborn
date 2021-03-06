/*
 * This file is part of TechReborn, licensed under the MIT License (MIT).
 *
 * Copyright (c) 2017 TechReborn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package techreborn.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import reborncore.RebornCore;

import techreborn.Core;
import techreborn.client.EGui;
import techreborn.client.TechRebornCreativeTabMisc;

import me.modmuss50.jsonDestroyer.api.ITexturedItem;

public class ItemDestructopack extends ItemTextureBase implements ITexturedItem {

	public ItemDestructopack() {
		this.setUnlocalizedName("techreborn.destructopack");
		this.setCreativeTab(TechRebornCreativeTabMisc.instance);
		RebornCore.jsonDestroyer.registerObject(this);
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(final World world, final EntityPlayer player,
			final EnumHand hand) {
		player.openGui(Core.INSTANCE, EGui.DESTRUCTOPACK.ordinal(), world, (int) player.posX, (int) player.posY,
				(int) player.posY);
		return new ActionResult<>(EnumActionResult.SUCCESS, player.getHeldItem(hand));
	}

	@Override
	public int getMaxMeta() {
		return 1;
	}

	@Override
	public String getTextureName(final int arg0) {
		return "techreborn:items/misc/destructopack";
	}
}
