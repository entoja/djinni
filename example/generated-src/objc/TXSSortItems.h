// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from example.djinni

#import "TXSSortOrder.h"
#import <Foundation/Foundation.h>
@class TXSItemList;
@class TXSSortItems;
@protocol TXSTextboxListener;


@interface TXSSortItems : NSObject

- (void)sort:(TXSSortOrder)order items:(TXSItemList *)items;

+ (TXSSortItems *)createWithListener:(id<TXSTextboxListener>)listener;

@end
