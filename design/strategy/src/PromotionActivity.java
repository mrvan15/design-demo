/**
 * 促销活动方案
 */
public class PromotionActivity{
   private IPromotionStrategy promotionStrategy;

   public PromotionActivity(IPromotionStrategy promotionStrategy) {
      this.promotionStrategy = promotionStrategy;
   }

   public void execute(){
      promotionStrategy.doPromotion();
   }
}
